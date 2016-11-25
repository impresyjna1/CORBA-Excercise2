package interfaces;


/**
* interfaces/UserServicePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from UserApp.idl
* piątek, 25 listopada 2016 01:22:17 CET
*/

public abstract class UserServicePOA extends org.omg.PortableServer.Servant
 implements interfaces.UserServiceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("createUser", new java.lang.Integer (0));
    _methods.put ("deleteUser", new java.lang.Integer (1));
    _methods.put ("getUser", new java.lang.Integer (2));
    _methods.put ("updateUser", new java.lang.Integer (3));
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
       case 0:  // interfaces/UserService/createUser
       {
         interfaces.User user = interfaces.UserHelper.read (in);
         this.createUser (user);
         out = $rh.createReply();
         break;
       }

       case 1:  // interfaces/UserService/deleteUser
       {
         interfaces.User user = interfaces.UserHelper.read (in);
         this.deleteUser (user);
         out = $rh.createReply();
         break;
       }

       case 2:  // interfaces/UserService/getUser
       {
         interfaces.User user = interfaces.UserHelper.read (in);
         this.getUser (user);
         out = $rh.createReply();
         break;
       }

       case 3:  // interfaces/UserService/updateUser
       {
         interfaces.User user = interfaces.UserHelper.read (in);
         this.updateUser (user);
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:interfaces/UserService:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public UserService _this() 
  {
    return UserServiceHelper.narrow(
    super._this_object());
  }

  public UserService _this(org.omg.CORBA.ORB orb) 
  {
    return UserServiceHelper.narrow(
    super._this_object(orb));
  }


} // class UserServicePOA
