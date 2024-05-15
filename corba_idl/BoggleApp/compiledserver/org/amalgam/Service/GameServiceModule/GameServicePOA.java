package org.amalgam.Service.GameServiceModule;


/**
* org/amalgam/Service/GameServiceModule/GameServicePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Thursday, May 16, 2024 1:07:05 AM PST
*/

public abstract class GameServicePOA extends org.omg.PortableServer.Servant
 implements org.amalgam.Service.GameServiceModule.GameServiceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("matchMake", new java.lang.Integer (0));
    _methods.put ("fetchWordBox", new java.lang.Integer (1));
    _methods.put ("getLeaderboards", new java.lang.Integer (2));
    _methods.put ("verifyWord", new java.lang.Integer (3));
    _methods.put ("validateTotalPoints", new java.lang.Integer (4));
    _methods.put ("fetchWinner", new java.lang.Integer (5));
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
       case 0:  // org/amalgam/Service/GameServiceModule/GameService/matchMake
       {
         try {
           org.amalgam.UIControllers.PlayerCallback player_callback = org.amalgam.Service.GameServiceModule.GameServicePackage.PlayerCallbackHelper.read (in);
           String $result = null;
           $result = this.matchMake (player_callback);
           out = $rh.createReply();
           out.write_string ($result);
         } catch (org.amalgam.Utils.Exceptions.MatchCreationFailedException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.MatchCreationFailedExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // org/amalgam/Service/GameServiceModule/GameService/fetchWordBox
       {
         try {
           int roomID = in.read_long ();
           char $result[][] = null;
           $result = this.fetchWordBox (roomID);
           out = $rh.createReply();
           org.amalgam.Service.GameServiceModule.GameServicePackage.MatrixHelper.write (out, $result);
         } catch (org.amalgam.Utils.Exceptions.WordFetchFailedException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.WordFetchFailedExceptionHelper.write (out, $ex);
         } catch (org.amalgam.Utils.Exceptions.InvalidRoomIDException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.InvalidRoomIDExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 2:  // org/amalgam/Service/GameServiceModule/GameService/getLeaderboards
       {
         try {
           String $result = null;
           $result = this.getLeaderboards ();
           out = $rh.createReply();
           out.write_string ($result);
         } catch (org.amalgam.Utils.Exceptions.EmptyLeaderBoardException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.EmptyLeaderBoardExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 3:  // org/amalgam/Service/GameServiceModule/GameService/verifyWord
       {
         try {
           String word = in.read_string ();
           this.verifyWord (word);
           out = $rh.createReply();
         } catch (org.amalgam.Utils.Exceptions.InvalidWordFormatException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.InvalidWordFormatExceptionHelper.write (out, $ex);
         } catch (org.amalgam.Utils.Exceptions.DuplicateWordException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.DuplicateWordExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 4:  // org/amalgam/Service/GameServiceModule/GameService/validateTotalPoints
       {
         try {
           int $result = (int)0;
           $result = this.validateTotalPoints ();
           out = $rh.createReply();
           out.write_long ($result);
         } catch (org.amalgam.Utils.Exceptions.InsufficientWordPointsException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.InsufficientWordPointsExceptionHelper.write (out, $ex);
         } catch (org.amalgam.Utils.Exceptions.InvalidTotalPointsException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.InvalidTotalPointsExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 5:  // org/amalgam/Service/GameServiceModule/GameService/fetchWinner
       {
         try {
           int lobbyId = in.read_long ();
           String $result = null;
           $result = this.fetchWinner (lobbyId);
           out = $rh.createReply();
           out.write_string ($result);
         } catch (org.amalgam.Utils.Exceptions.LobbyDoesNotExistException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.LobbyDoesNotExistExceptionHelper.write (out, $ex);
         } catch (org.amalgam.Utils.Exceptions.WinnerDoesNotExistException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.WinnerDoesNotExistExceptionHelper.write (out, $ex);
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
    "IDL:org/amalgam/Service/GameServiceModule/GameService:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public GameService _this() 
  {
    return GameServiceHelper.narrow(
    super._this_object());
  }

  public GameService _this(org.omg.CORBA.ORB orb) 
  {
    return GameServiceHelper.narrow(
    super._this_object(orb));
  }


} // class GameServicePOA
