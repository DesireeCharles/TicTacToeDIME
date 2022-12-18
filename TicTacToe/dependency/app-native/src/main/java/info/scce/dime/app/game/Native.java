package info.scce.dime.app.game;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;

import de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.TableController;
import de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.TableRowController;
import de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.TableEntryController;
import de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.EntryStateController;
import de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.TurnStateController;

import de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table;
import de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableRow;
import de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry;
import de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState;
import de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState;

import javax.inject.Inject;
import javax.enterprise.context.ApplicationScoped;
import java.util.*;  
import java.util.stream.Collectors;

import static java.lang.System.exit;



/**
 * Collection of static methods for native SIBs
 */
@ApplicationScoped
public class Native {
	@Inject
	protected TableController tController;
	@Inject
	protected TableRowController trController;
	@Inject
	protected TableEntryController teController;
	@Inject
	protected EntryStateController stateController;
	@Inject
	protected TurnStateController turnController;


	
	public static Table createGameBoard(long width, long height) {
		Native one = new Native();
		return one.init(width, height);
		// new table.
//		if(getBean(TableController.class).createTransient("Object Name") == null){
//			System.err.print("NO VALUE");
//		} else {
//			System.err.println("VALUE");
//		}


//		Table table = getBean(TableController.class).create(null);
//		Table table = tController.create(null);
//
//
//
//		List<TableRow> tableRowList = new ArrayList<TableRow>();
//		for (int x = 0; x < width; x++) {
//			TableRow tableRow = getBean(TableRowController.class).create(null);
//			System.err.println("inside for loop x =" + x);
//			TableRow tableRow = trController.create(null);
//			List<TableEntry> tableEntryList = new ArrayList<TableEntry>();
//			for (int y = 0; y < height; y++) {
//
//				System.err.println("inside nested for loop y =" + y);
////				TableEntry tableEntry = getBean(TableEntryController.class).create(null);
//				TableEntry tableEntry = teContoller.create(null);
//						tableEntry.setvalue("1");
//				tableEntryList.add(tableEntry);
//			}
//
//			tableRow.settableEntry_TableEntry(tableEntryList);
//			tableRowList.add(tableRow);
//		}
//		table.settableRow_TableRow(tableRowList);
//
//		return table;
	}


	public Table init(long width, long height){
			Table table = getBean(TableController.class).create(null);


		List<TableRow> tableRowList = new ArrayList<TableRow>();
		long counter = 0;
		for (int x = 0; x < width; x++) {
			TableRow tableRow = getBean(TableRowController.class).create(null);
			System.err.println("inside for loop x =" + x);
			List<TableEntry> tableEntryList = new ArrayList<TableEntry>();
			for (int y = 0; y < height; y++) {

				System.err.println("inside nested for loop y =" + y);
				TableEntry tableEntry = getBean(TableEntryController.class).create(null);
				EntryState entryState = EntryState.empty;
				tableEntry.setentryState(entryState);
				tableEntry.setstateValue(counter + 10);
				counter++;
				tableEntryList.add(tableEntry);
			}

			tableRow.settableEntry_TableEntry(tableEntryList);
			tableRowList.add(tableRow);
		}
		table.settableRow_TableRow(tableRowList);

		return table;
	}

	@SuppressWarnings("unchecked")
	private static <T> T getBean(Class<T> clazz) {
		final BeanManager beanManager = CDI.current().getBeanManager();
		System.err.println(beanManager);
		final Bean<T> bean = (Bean<T>) beanManager.resolve(beanManager.getBeans(clazz));
		System.err.println(bean);
		final CreationalContext<T> cctx = beanManager.createCreationalContext(bean);
		System.err.println(cctx);

		return (T) beanManager.getReference(bean, bean.getBeanClass(), cctx);
	}
	
    public static boolean checkWin(Table _table) {

        Long[][] table = new Long[3][3];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                table[i][j] = _table.gettableRow_TableRow().get(i).gettableEntry_TableEntry().get(j).getstateValue();
            }
        }
        //vertical
        for(int i = 0; i < 3; i++) {
            if(table[i][0] == table[i][1] && table[i][1] == table[i][2]) {
                return true;
            }
        }
        //horizontal
        for (int i = 0; i < 3; i++) {
            if(table[0][i] == table[1][i] && table[1][i] == table[2][i]) {
                return true;
            }   
        }
        //diagonal /
        if(table[0][0] == table[1][1] && table[1][1] == table[2][2]) {
            return true;
        }
        //diagonal \
        if(table[0][2] == table[1][1] && table[1][1] == table[2][0]) {
            return true;
        }
        //no win
        return false;
    }
}