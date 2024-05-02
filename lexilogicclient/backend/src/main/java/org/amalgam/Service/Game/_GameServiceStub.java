package org.amalgam.Service.Game;


/**
* org/amalgam/Service/Game/_GameServiceStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Thursday, May 2, 2024 9:20:49 AM CST
*/

public class _GameServiceStub extends org.omg.CORBA.portable.ObjectImpl implements org.amalgam.Service.Game.GameService
{

  public org.amalgam.Service.Game.GameServicePackage.GameRoom matchMake (org.amalgam.Service.Game.PlayerCallback player_callback) throws org.amalgam.Service.GameExceptions.MatchCreationFailed
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("matchMake", true);
                org.amalgam.Service.Game.PlayerCallbackHelper.write ($out, player_callback);
                $in = _invoke ($out);
                org.amalgam.Service.Game.GameServicePackage.GameRoom $result = org.amalgam.Service.Game.GameServicePackage.GameRoomHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Service/GameExceptions/MatchCreationFailed:1.0"))
                    throw org.amalgam.Service.GameExceptions.MatchCreationFailedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return matchMake (player_callback        );
            } finally {
                _releaseReply ($in);
            }
  } // matchMake

  public char[][] fetchWordBox (int roomID) throws org.amalgam.Service.GameExceptions.WordFetchException, org.amalgam.Service.GameExceptions.InvalidRoomID
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("fetchWordBox", true);
                $out.write_long (roomID);
                $in = _invoke ($out);
                char $result[][] = org.amalgam.Service.Game.GameServicePackage.MatrixHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Service/GameExceptions/WordFetchException:1.0"))
                    throw org.amalgam.Service.GameExceptions.WordFetchExceptionHelper.read ($in);
                else if (_id.equals ("IDL:org/amalgam/Service/GameExceptions/InvalidRoomID:1.0"))
                    throw org.amalgam.Service.GameExceptions.InvalidRoomIDHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return fetchWordBox (roomID        );
            } finally {
                _releaseReply ($in);
            }
  } // fetchWordBox

  public org.amalgam.Service.Game.GameServicePackage.Leaderboard[] getLeaderboards () throws org.amalgam.Service.GameExceptions.EmptyLeaderBoard
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getLeaderboards", true);
                $in = _invoke ($out);
                org.amalgam.Service.Game.GameServicePackage.Leaderboard $result[] = org.amalgam.Service.Game.GameServicePackage.leaderboardsHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Service/GameExceptions/EmptyLeaderBoard:1.0"))
                    throw org.amalgam.Service.GameExceptions.EmptyLeaderBoardHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getLeaderboards (        );
            } finally {
                _releaseReply ($in);
            }
  } // getLeaderboards

  public void verifyWord (String word) throws org.amalgam.Service.GameExceptions.InvalidWordFormat, org.amalgam.Service.GameExceptions.DuplicateWordException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("verifyWord", true);
                $out.write_string (word);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Service/GameExceptions/InvalidWordFormat:1.0"))
                    throw org.amalgam.Service.GameExceptions.InvalidWordFormatHelper.read ($in);
                else if (_id.equals ("IDL:org/amalgam/Service/GameExceptions/DuplicateWordException:1.0"))
                    throw org.amalgam.Service.GameExceptions.DuplicateWordExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                verifyWord (word        );
            } finally {
                _releaseReply ($in);
            }
  } // verifyWord

  public int validateTotalPoints (String[] word) throws org.amalgam.Service.GameExceptions.InsufficientWordPoints, org.amalgam.Service.GameExceptions.InvalidTotalPoints
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("validateTotalPoints", true);
                org.amalgam.Service.Game.GameServicePackage.wordsHelper.write ($out, word);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Service/GameExceptions/InsufficientWordPoints:1.0"))
                    throw org.amalgam.Service.GameExceptions.InsufficientWordPointsHelper.read ($in);
                else if (_id.equals ("IDL:org/amalgam/Service/GameExceptions/InvalidTotalPoints:1.0"))
                    throw org.amalgam.Service.GameExceptions.InvalidTotalPointsHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return validateTotalPoints (word        );
            } finally {
                _releaseReply ($in);
            }
  } // validateTotalPoints

  public String fetchWinner (int lobbyId) throws org.amalgam.Service.GameExceptions.InvalidLobbyID, org.amalgam.Service.GameExceptions.WinnerDoesNotExist
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("fetchWinner", true);
                $out.write_long (lobbyId);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Service/GameExceptions/InvalidLobbyID:1.0"))
                    throw org.amalgam.Service.GameExceptions.InvalidLobbyIDHelper.read ($in);
                else if (_id.equals ("IDL:org/amalgam/Service/GameExceptions/WinnerDoesNotExist:1.0"))
                    throw org.amalgam.Service.GameExceptions.WinnerDoesNotExistHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return fetchWinner (lobbyId        );
            } finally {
                _releaseReply ($in);
            }
  } // fetchWinner

  public void insertLobby (org.amalgam.Service.Game.GameServicePackage.Lobby lobby) throws org.amalgam.Service.GameExceptions.InvalidLobbyData
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("insertLobby", true);
                org.amalgam.Service.Game.GameServicePackage.LobbyHelper.write ($out, lobby);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Service/GameExceptions/InvalidLobbyData:1.0"))
                    throw org.amalgam.Service.GameExceptions.InvalidLobbyDataHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                insertLobby (lobby        );
            } finally {
                _releaseReply ($in);
            }
  } // insertLobby

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:org/amalgam/Service/Game/GameService:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
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
} // class _GameServiceStub
