package org.aplusstudios.com.signalclient.database;

public class NoSuchMessageException extends Exception {
  public NoSuchMessageException(String s) {super(s);}
  public NoSuchMessageException(Exception e) {super(e);}
}
