package org.amalgam.Service.PlayerServiceModule;


/**
* org/amalgam/Service/PlayerServiceModule/PlayerServicePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Thursday, May 16, 2024 1:07:04 AM PST
*/

public abstract class PlayerServicePOA extends org.omg.PortableServer.Servant
 implements org.amalgam.Service.PlayerServiceModule.PlayerServiceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("login", new java.lang.Integer (0));
    _methods.put ("logout", new java.lang.Integer (1));
    _methods.put ("createAccount", new java.lang.Integer (2));
    _methods.put ("changeUsername", new java.lang.Integer (3));
    _methods.put ("changePassword", new java.lang.Integer (4));
    _methods.put ("accountDeletionRequest", new java.lang.Integer (5));
    _methods.put ("getGameHistory", new java.lang.Integer (6));
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
       case 0:  // org/amalgam/Service/PlayerServiceModule/PlayerService/login
       {
         try {
           org.amalgam.UIControllers.PlayerCallback player_callback = org.amalgam.Service.PlayerServiceModule.PlayerServicePackage.PlayerCallbackHelper.read (in);
           String password = in.read_string ();
           this.login (player_callback, password);
           out = $rh.createReply();
         } catch (org.amalgam.Utils.Exceptions.AlreadyLoggedInException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.AlreadyLoggedInExceptionHelper.write (out, $ex);
         } catch (org.amalgam.Utils.Exceptions.InvalidCredentialsException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.InvalidCredentialsExceptionHelper.write (out, $ex);
         } catch (org.amalgam.Utils.Exceptions.UserExistenceException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.UserExistenceExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // org/amalgam/Service/PlayerServiceModule/PlayerService/logout
       {
         try {
           String username = in.read_string ();
           this.logout (username);
           out = $rh.createReply();
         } catch (org.amalgam.Utils.Exceptions.NotLoggedInException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.NotLoggedInExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 2:  // org/amalgam/Service/PlayerServiceModule/PlayerService/createAccount
       {
         try {
           String username = in.read_string ();
           String password = in.read_string ();
           this.createAccount (username, password);
           out = $rh.createReply();
         } catch (org.amalgam.Utils.Exceptions.AccountCreationFailedException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.AccountCreationFailedExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 3:  // org/amalgam/Service/PlayerServiceModule/PlayerService/changeUsername
       {
         try {
           String username = in.read_string ();
           String newUsername = in.read_string ();
           this.changeUsername (username, newUsername);
           out = $rh.createReply();
         } catch (org.amalgam.Utils.Exceptions.ChangeUsernameFailedException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.ChangeUsernameFailedExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 4:  // org/amalgam/Service/PlayerServiceModule/PlayerService/changePassword
       {
         try {
           String username = in.read_string ();
           String newPassword = in.read_string ();
           this.changePassword (username, newPassword);
           out = $rh.createReply();
         } catch (org.amalgam.Utils.Exceptions.ChangePasswordFailedException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.ChangePasswordFailedExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 5:  // org/amalgam/Service/PlayerServiceModule/PlayerService/accountDeletionRequest
       {
         try {
           String username = in.read_string ();
           this.accountDeletionRequest (username);
           out = $rh.createReply();
         } catch (org.amalgam.Utils.Exceptions.DeleteAccountFailedException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.DeleteAccountFailedExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 6:  // org/amalgam/Service/PlayerServiceModule/PlayerService/getGameHistory
       {
         try {
           String username = in.read_string ();
           String $result = null;
           $result = this.getGameHistory (username);
           out = $rh.createReply();
           out.write_string ($result);
         } catch (org.amalgam.Utils.Exceptions.GameHistoryUnavailableException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.GameHistoryUnavailableExceptionHelper.write (out, $ex);
         } catch (org.amalgam.Utils.Exceptions.InGameException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.InGameExceptionHelper.write (out, $ex);
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
    "IDL:org/amalgam/Service/PlayerServiceModule/PlayerService:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public PlayerService _this() 
  {
    return PlayerServiceHelper.narrow(
    super._this_object());
  }

  public PlayerService _this(org.omg.CORBA.ORB orb) 
  {
    return PlayerServiceHelper.narrow(
    super._this_object(orb));
  }


} // class PlayerServicePOA
