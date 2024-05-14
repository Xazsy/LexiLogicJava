package org.amalgam.backend.microservices.client;

import org.amalgam.Utils.Exceptions.GameHistoryUnavailableException;
import org.amalgam.Utils.Exceptions.InGameException;
import org.amalgam.backend.microservices.serverconnection.ORBConnection;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.InvalidName;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class GetGameHistoryMicroservice {
    private final ORBConnection orbConnection;

    public GetGameHistoryMicroservice(ORBConnection orbConnection) {
        this.orbConnection = new ORBConnection(1099, "localhost");
    }

    public String process (String username){
        try {
           return orbConnection.retrievePlayerRequestStub().getGameHistory(username);
        } catch (GameHistoryUnavailableException | InGameException | InvalidName | CannotProceed | NotFound e) {
            throw new RuntimeException(e);
        }
    }
}
