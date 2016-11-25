package interfaces;


/**
* interfaces/User.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from UserApp.idl
* piątek, 25 listopada 2016 01:22:17 CET
*/

public final class User implements org.omg.CORBA.portable.IDLEntity
{
  public String login = null;
  public String name = null;
  public String surname = null;
  public int age = (int)0;
  public boolean isAdmin = false;

  public User ()
  {
  } // ctor

  public User (String _login, String _name, String _surname, int _age, boolean _isAdmin)
  {
    login = _login;
    name = _name;
    surname = _surname;
    age = _age;
    isAdmin = _isAdmin;
  } // ctor

} // class User
