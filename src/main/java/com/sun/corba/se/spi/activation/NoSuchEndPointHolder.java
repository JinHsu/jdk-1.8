package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/NoSuchEndPointHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tester/jenkins/workspace/zulu8-build-macos-aarch64/zulu-src.git/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Monday, April 18, 2022 8:36:02 AM PDT
*/

public final class NoSuchEndPointHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.NoSuchEndPoint value = null;

  public NoSuchEndPointHolder ()
  {
  }

  public NoSuchEndPointHolder (com.sun.corba.se.spi.activation.NoSuchEndPoint initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.NoSuchEndPointHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.NoSuchEndPointHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.NoSuchEndPointHelper.type ();
  }

}
