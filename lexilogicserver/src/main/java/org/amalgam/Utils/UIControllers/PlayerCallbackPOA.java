package org.amalgam.Utils.UIControllers;


/**
* org/amalgam/Utils/UIControllers/PlayerCallbackPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 8, 2024 1:24:07 AM SGT
*/

public abstract class PlayerCallbackPOA extends org.omg.PortableServer.Servant
 implements PlayerCallbackOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("uiCall", new Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    Integer __method = (Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // org/amalgam/Utils/UIControllers/PlayerCallback/uiCall
       {
         try {
           int lobbyId = in.read_long ();
           this.uiCall (lobbyId);
           out = $rh.createReply();
         } catch (org.amalgam.Utils.Exceptions.InvalidRequestException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.Utils.Exceptions.InvalidRequestExceptionHelper.write (out, $ex);
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
    "IDL:org/amalgam/Utils/UIControllers/PlayerCallback:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public PlayerCallback _this() 
  {
    return PlayerCallbackHelper.narrow(
    super._this_object());
  }

  public PlayerCallback _this(org.omg.CORBA.ORB orb) 
  {
    return PlayerCallbackHelper.narrow(
    super._this_object(orb));
  }


} // class PlayerCallbackPOA
