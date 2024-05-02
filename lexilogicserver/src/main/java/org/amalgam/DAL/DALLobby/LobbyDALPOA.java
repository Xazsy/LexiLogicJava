package org.amalgam.DAL.DALLobby;


/**
* org/amalgam/DAL/DALLobby/LobbyDALPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DataAccessLayer.idl
* Saturday, April 27, 2024 5:44:19 PM SGT
*/

public abstract class LobbyDALPOA extends org.omg.PortableServer.Servant
 implements org.amalgam.DAL.DALLobby.LobbyDALOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertNewLobby", new java.lang.Integer (0));
    _methods.put ("getLobbyByID", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // org/amalgam/DAL/DALLobby/LobbyDAL/insertNewLobby
       {
         try {
           int lobbyId = in.read_long ();
           String createdBy = in.read_string ();
           String winner = in.read_string ();
           this.insertNewLobby (lobbyId, createdBy, winner);
           out = $rh.createReply();
         } catch (org.amalgam.DAL.SQLExceptions.SQLCreateError $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.DAL.SQLExceptions.SQLCreateErrorHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // org/amalgam/DAL/DALLobby/LobbyDAL/getLobbyByID
       {
         try {
           int lobbyId = in.read_long ();
           org.amalgam.DAL.DALLobby.LobbyDALPackage.Lobby $result = null;
           $result = this.getLobbyByID (lobbyId);
           out = $rh.createReply();
           org.amalgam.DAL.DALLobby.LobbyDALPackage.LobbyHelper.write (out, $result);
         } catch (org.amalgam.DAL.SQLExceptions.SQLRetrieveError $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.DAL.SQLExceptions.SQLRetrieveErrorHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:org/amalgam/DAL/DALLobby/LobbyDAL:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public LobbyDAL _this() 
  {
    return LobbyDALHelper.narrow(
    super._this_object());
  }

  public LobbyDAL _this(org.omg.CORBA.ORB orb) 
  {
    return LobbyDALHelper.narrow(
    super._this_object(orb));
  }


} // class LobbyDALPOA
