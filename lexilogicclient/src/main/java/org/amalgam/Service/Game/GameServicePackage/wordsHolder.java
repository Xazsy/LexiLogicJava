package org.amalgam.Service.Game.GameServicePackage;


/**
* org/amalgam/Service/Game/GameServicePackage/wordsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Saturday, April 27, 2024 5:35:13 PM SGT
*/

public final class wordsHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public wordsHolder ()
  {
  }

  public wordsHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.Service.Game.GameServicePackage.wordsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.Service.Game.GameServicePackage.wordsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.Service.Game.GameServicePackage.wordsHelper.type ();
  }

}
