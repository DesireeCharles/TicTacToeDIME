package info.scce.dime.util;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.Status;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

public class TransactionUtil {

	public static UserTransaction lookupTX() throws NamingException {
		return (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
	}

	public static void beginTX(final UserTransaction tx) throws SystemException, NotSupportedException {

		if (tx.getStatus() == Status.STATUS_NO_TRANSACTION || tx.getStatus() == Status.STATUS_ROLLEDBACK) {
			tx.begin();
		}
		else if (tx.getStatus() != Status.STATUS_ACTIVE) {
			throw new IllegalArgumentException("Transaction is neither in state '" + Status.STATUS_NO_TRANSACTION
					+ "' nor '" + Status.STATUS_ACTIVE + "', but: " + tx.getStatus());
		}
	}

	public static void commitTX(UserTransaction tx) throws SystemException,
			HeuristicRollbackException, HeuristicMixedException, RollbackException {

		if (tx != null) {
			if (tx.getStatus() == Status.STATUS_MARKED_ROLLBACK) {
				rollbackTX(tx);
			}
			else if (tx.getStatus() == Status.STATUS_ACTIVE) {
				tx.commit();
			}
		}
	}

	public static void rollbackTX(UserTransaction tx) throws SystemException {
		if (tx != null && (tx.getStatus() == Status.STATUS_ACTIVE || tx.getStatus() == Status.STATUS_MARKED_ROLLBACK)) {
			tx.rollback();
		}
	}
}
