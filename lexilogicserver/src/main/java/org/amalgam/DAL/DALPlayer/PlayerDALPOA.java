package org.amalgam.DAL.DALPlayer;


/**
* org/amalgam/DAL/DALPlayer/PlayerDALPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DataAccessLayer.idl
* Saturday, April 27, 2024 5:44:19 PM SGT
*/

public abstract class PlayerDALPOA extends org.omg.PortableServer.Servant
 implements org.amalgam.DAL.DALPlayer.PlayerDALOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertNewPlayer", new java.lang.Integer (0));
    _methods.put ("getPlayerByID", new java.lang.Integer (1));
    _methods.put ("updatePassword", new java.lang.Integer (2));
    _methods.put ("updateUsername", new java.lang.Integer (3));
    _methods.put ("deletePlayer", new java.lang.Integer (4));
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
       case 0:  // org/amalgam/DAL/DALPlayer/PlayerDAL/insertNewPlayer
       {
         try {
           String username = in.read_string ();
           String password = in.read_string ();
           String lastLogin = in.read_string ();
           this.insertNewPlayer (username, password, lastLogin);
           out = $rh.createReply();
         } catch (org.amalgam.DAL.SQLExceptions.SQLCreateError $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.DAL.SQLExceptions.SQLCreateErrorHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // org/amalgam/DAL/DALPlayer/PlayerDAL/getPlayerByID
       {
         try {
           int playerID = in.read_long ();
           org.amalgam.DAL.DALPlayer.PlayerDALPackage.Player $result = null;
           $result = this.getPlayerByID (playerID);
           out = $rh.createReply();
           org.amalgam.DAL.DALPlayer.PlayerDALPackage.PlayerHelper.write (out, $result);
         } catch (org.amalgam.DAL.SQLExceptions.SQLRetrieveError $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.DAL.SQLExceptions.SQLRetrieveErrorHelper.write (out, $ex);
         }
         break;
       }

       case 2:  // org/amalgam/DAL/DALPlayer/PlayerDAL/updatePassword
       {
         try {
           int playerID = in.read_long ();
           String newPassword = in.read_string ();
           this.updatePassword (playerID, newPassword);
           out = $rh.createReply();
         } catch (org.amalgam.DAL.SQLExceptions.SQLUpdateError $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.DAL.SQLExceptions.SQLUpdateErrorHelper.write (out, $ex);
         }
         break;
       }

       case 3:  // org/amalgam/DAL/DALPlayer/PlayerDAL/updateUsername
       {
         try {
           int playerID = in.read_long ();
           String newUsername = in.read_string ();
           this.updateUsername (playerID, newUsername);
           out = $rh.createReply();
         } catch (org.amalgam.DAL.SQLExceptions.SQLUpdateError $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.DAL.SQLExceptions.SQLUpdateErrorHelper.write (out, $ex);
         }
         break;
       }

       case 4:  // org/amalgam/DAL/DALPlayer/PlayerDAL/deletePlayer
       {
         try {
           int playerID = in.read_long ();
           this.deletePlayer (playerID);
           out = $rh.createReply();
         } catch (org.amalgam.DAL.SQLExceptions.SQLDeleteError $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.DAL.SQLExceptions.SQLDeleteErrorHelper.write (out, $ex);
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
    "IDL:org/amalgam/DAL/DALPlayer/PlayerDAL:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public PlayerDAL _this() 
  {
    return PlayerDALHelper.narrow(
    super._this_object());
  }

  public PlayerDAL _this(org.omg.CORBA.ORB orb) 
  {
    return PlayerDALHelper.narrow(
    super._this_object(orb));
  }


} // class PlayerDALPOA
