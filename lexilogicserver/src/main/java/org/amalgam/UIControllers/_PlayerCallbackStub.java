package org.amalgam.UIControllers;


/**
* org/amalgam/UIControllers/_PlayerCallbackStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from UIControllers.idl
* Wednesday, May 29, 2024 9:39:27 PM PST
*/

public class _PlayerCallbackStub extends org.omg.CORBA.portable.ObjectImpl implements PlayerCallback
{

  public String username ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_username", true);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return username (        );
            } finally {
                _releaseReply ($in);
            }
  } // username

  public void username (String newUsername)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_set_username", true);
                $out.write_string (newUsername);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                username (newUsername        );
            } finally {
                _releaseReply ($in);
            }
  } // username

  public void uiCall (String jsonString) throws org.amalgam.ControllerException.InvalidRequestException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("uiCall", true);
                $out.write_string (jsonString);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/ControllerException/InvalidRequestException:1.0"))
                    throw org.amalgam.ControllerException.InvalidRequestExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                uiCall (jsonString        );
            } finally {
                _releaseReply ($in);
            }
  } // uiCall

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:org/amalgam/UIControllers/PlayerCallback:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     com.sun.corba.se.impl.orbutil.IORCheckImpl.check(str, "org.amalgam.UIControllers._PlayerCallbackStub");
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
