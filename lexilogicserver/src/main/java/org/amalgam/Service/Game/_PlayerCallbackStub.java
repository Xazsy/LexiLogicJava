package org.amalgam.Service.Game;


/**
* org/amalgam/Service/Game/_PlayerCallbackStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Saturday, April 27, 2024 5:34:25 PM SGT
*/

public class _PlayerCallbackStub extends org.omg.CORBA.portable.ObjectImpl implements org.amalgam.Service.Game.PlayerCallback
{

  public void uiCall () throws org.amalgam.Service.GameExceptions.InvalidRequestException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("uiCall", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Service/GameExceptions/InvalidRequestException:1.0"))
                    throw org.amalgam.Service.GameExceptions.InvalidRequestExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                uiCall (        );
            } finally {
                _releaseReply ($in);
            }
  } // uiCall

  public void setUser (org.amalgam.Service.Game.GameServicePackage.Player player) throws org.amalgam.Service.GameExceptions.InvalidRequestException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setUser", true);
                org.amalgam.Service.Game.GameServicePackage.PlayerHelper.write ($out, player);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Service/GameExceptions/InvalidRequestException:1.0"))
                    throw org.amalgam.Service.GameExceptions.InvalidRequestExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setUser (player        );
            } finally {
                _releaseReply ($in);
            }
  } // setUser

  public org.amalgam.Service.Game.GameServicePackage.Player getPlayer () throws org.amalgam.Service.GameExceptions.InvalidRequestException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getPlayer", true);
                $in = _invoke ($out);
                org.amalgam.Service.Game.GameServicePackage.Player $result = org.amalgam.Service.Game.PlayerCallbackPackage.playerHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Service/GameExceptions/InvalidRequestException:1.0"))
                    throw org.amalgam.Service.GameExceptions.InvalidRequestExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getPlayer (        );
            } finally {
                _releaseReply ($in);
            }
  } // getPlayer

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:org/amalgam/Service/Game/PlayerCallback:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     com.sun.corba.se.impl.orbutil.IORCheckImpl.check(str, "org.amalgam.Service.Game._PlayerCallbackStub");
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
} // class _PlayerCallbackStub
