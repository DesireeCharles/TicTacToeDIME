package info.scce.dime.process;

import javax.enterprise.inject.spi.BeanManager;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;
import info.scce.dime.util.Constants;

@JsonIdentityInfo(generator = JSOGGenerator.class)
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = Constants.DYWA_RUNTIME_TYPE, visible = true)
public abstract class JSONContext {

	public abstract DIMEProcessContext toContext(BeanManager bm, ProcessCallFrame callStack);

}
