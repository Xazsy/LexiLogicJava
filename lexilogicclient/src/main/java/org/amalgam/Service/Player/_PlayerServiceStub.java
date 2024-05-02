package org.amalgam.Service.Player;


/**
* org/amalgam/Service/Player/_PlayerServiceStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Monday, April 29, 2024 7:32:02 PM SGT
*/

public class _PlayerServiceStub extends org.omg.CORBA.portable.ObjectImpl implements org.amalgam.Service.Player.PlayerService
{

  public void login (org.amalgam.Service.Player.PlayerCallback player_callback) throws org.amalgam.Service.PlayerExceptions.AlreadyLoggedIn, org.amalgam.Service.PlayerExceptions.InvalidCredentials, org.amalgam.Service.PlayerExceptions.UserExistenceException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("login", true);
                org.amalgam.Service.Player.PlayerCallbackHelper.write ($out, player_callback);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Service/PlayerExceptions/AlreadyLoggedIn:1.0"))
                    throw org.amalgam.Service.PlayerExceptions.AlreadyLoggedInHelper.read ($in);
                else if (_id.equals ("IDL:org/amalgam/Service/PlayerExceptions/InvalidCredentials:1.0"))
                    throw org.amalgam.Service.PlayerExceptions.InvalidCredentialsHelper.read ($in);
                else if (_id.equals ("IDL:org/amalgam/Service/PlayerExceptions/UserExistenceException:1.0"))
                    throw org.amalgam.Service.PlayerExceptions.UserExistenceExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                login (player_callback        );
            } finally {
                _releaseReply ($in);
            }
  } // login

  public void logout () throws org.amalgam.Service.PlayerExceptions.NotLoggedIn
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("logout", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Service/PlayerExceptions/NotLoggedIn:1.0"))
                    throw org.amalgam.Service.PlayerExceptions.NotLoggedInHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                logout (        );
            } finally {
                _releaseReply ($in);
            }
  } // logout

  public void changeUsername (String username, String newUsername) throws org.amalgam.Service.PlayerExceptions.ChangeUsernameFailed
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("changeUsername", true);
                $out.write_string (username);
                $out.write_string (newUsername);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Service/PlayerExceptions/ChangeUsernameFailed:1.0"))
                    throw org.amalgam.Service.PlayerExceptions.ChangeUsernameFailedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                changeUsername (username, newUsername        );
            } finally {
                _releaseReply ($in);
            }
  } // changeUsername

  public void changePassword (String username, String newPassword) throws org.amalgam.Service.PlayerExceptions.ChangePasswordFailed
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("changePassword", true);
                $out.write_string (username);
                $out.write_string (newPassword);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Service/PlayerExceptions/ChangePasswordFailed:1.0"))
                    throw org.amalgam.Service.PlayerExceptions.ChangePasswordFailedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                changePassword (username, newPassword        );
            } finally {
                _releaseReply ($in);
            }
  } // changePassword

  public void deleteAccount (String username) throws org.amalgam.Service.PlayerExceptions.DeleteAccountFailed
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("deleteAccount", true);
                $out.write_string (username);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Service/PlayerExceptions/DeleteAccountFailed:1.0"))
                    throw org.amalgam.Service.PlayerExceptions.DeleteAccountFailedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                deleteAccount (username        );
            } finally {
                _releaseReply ($in);
            }
  } // deleteAccount

  public void submitWord (String word, String username) throws org.amalgam.Service.PlayerExceptions.SubmitWordFailed
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("submitWord", true);
                $out.write_string (word);
                $out.write_string (username);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Service/PlayerExceptions/SubmitWordFailed:1.0"))
                    throw org.amalgam.Service.PlayerExceptions.SubmitWordFailedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                submitWord (word, username        );
            } finally {
                _releaseReply ($in);
            }
  } // submitWord

  public void startGame (String username) throws org.amalgam.Service.PlayerExceptions.StartGameFailed, org.amalgam.Service.PlayerExceptions.InGameException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("startGame", true);
                $out.write_string (username);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Service/PlayerExceptions/StartGameFailed:1.0"))
                    throw org.amalgam.Service.PlayerExceptions.StartGameFailedHelper.read ($in);
                else if (_id.equals ("IDL:org/amalgam/Service/PlayerExceptions/InGameException:1.0"))
                    throw org.amalgam.Service.PlayerExceptions.InGameExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                startGame (username        );
            } finally {
                _releaseReply ($in);
            }
  } // startGame

  public void getGameResult () throws org.amalgam.Service.PlayerExceptions.GameResultUnavailable, org.amalgam.Service.PlayerExceptions.InGameException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getGameResult", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Service/PlayerExceptions/GameResultUnavailable:1.0"))
                    throw org.amalgam.Service.PlayerExceptions.GameResultUnavailableHelper.read ($in);
                else if (_id.equals ("IDL:org/amalgam/Service/PlayerExceptions/InGameException:1.0"))
                    throw org.amalgam.Service.PlayerExceptions.InGameExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                getGameResult (        );
            } finally {
                _releaseReply ($in);
            }
  } // getGameResult

  public void getGameHistory () throws org.amalgam.Service.PlayerExceptions.GameHistoryUnavailable, org.amalgam.Service.PlayerExceptions.InGameException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getGameHistory", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Service/PlayerExceptions/GameHistoryUnavailable:1.0"))
                    throw org.amalgam.Service.PlayerExceptions.GameHistoryUnavailableHelper.read ($in);
                else if (_id.equals ("IDL:org/amalgam/Service/PlayerExceptions/InGameException:1.0"))
                    throw org.amalgam.Service.PlayerExceptions.InGameExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                getGameHistory (        );
            } finally {
                _releaseReply ($in);
            }
  } // getGameHistory

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:org/amalgam/Service/Player/PlayerService:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     com.sun.corba.se.impl.orbutil.IORCheckImpl.check(str, "org.amalgam.Service.Player._PlayerServiceStub");
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _PlayerServiceStub
