package org.bonitasoft.engine.api;

import java.io.Serializable;
import java.util.Map;

import org.bonitasoft.engine.api.APIAccessor;
import org.bonitasoft.engine.command.TenantCommand;

/**
 * The TenantAccessorCommand is use when the command call the Bonita API.
 * An APIaccessor is given at execution.
 * @author Firstname Lastname
 *
 */
public abstract class TenantAccessorCommand extends TenantCommand {
    
    /**
     * Execute the command, giving an Bonita API Accessor.
     * Command can use the API Accessor to execute any operation. User behind the API Accessor is the System User.
     * @param parameters
     * @param apiAccessor
     * @return
     */
    public abstract Serializable execute(Map<String, Serializable> parameters, APIAccessor apiAccessor);

    /**
     * After the deployment, the command Engine calls this method. The command can then do anything useful to complete the deployment.  
     * @param parameters
     * @param apiAccessor
     * @return
     */
    public abstract Serializable afterDeployment(APIAccessor apiAccessor);
    
    /**
     * Before the unregister, the command Engine calls this method. The command can then do anything useful to unregister the command completely  
     * @param parameters
     * @param apiAccessor
     * @return
     */
    public abstract Serializable beforeUnregister(Map<String, Serializable> parameters, APIAccessor apiAccessor);

}
