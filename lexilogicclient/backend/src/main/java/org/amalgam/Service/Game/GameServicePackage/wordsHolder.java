package org.amalgam.Service.Game.GameServicePackage;


/**
* org/amalgam/Service/Game/GameServicePackage/wordsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Thursday, May 2, 2024 9:20:49 AM CST
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
