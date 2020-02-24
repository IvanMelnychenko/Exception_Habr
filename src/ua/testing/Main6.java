package ua.testing;

public class Main6 {

  public static void main(String[] args) {
    /*try{
      System.err.println(" 0");
     if(true) throw new RuntimeException();
      System.err.println(" 1");
    }
    catch (RuntimeException e){
      System.err.println(" 2");
      if(true) throw new Error();
    }
    System.err.println(" 3");*/


    /*try{
      System.err.println(" 0");
      if(true) throw new RuntimeException();
      System.err.println(" 1");
    }
    catch (RuntimeException e){
      System.err.println(" 2");
      if(true) throw e;
    }
    System.err.println(" 3");*/

    /*try {
      System.err.println(" 0");
      if (true) {
        throw new RuntimeException();
      }
      System.err.println(" 1");
    } catch (RuntimeException e) {
      System.err.println(" 2");
      if (true) {
        throw new Error();
      }
    } catch (Error e) {
      System.err.println(" 3");
    }*/


    /*try {
      throw new Exception();
    } catch (RuntimeException e) {
      System.err.println("catch RuntimeException");
    } catch (Exception ex) {
      System.err.println("catch Exception");
    } catch (Throwable t) {
      System.err.println("catch Throwable");
    }*/


    /*try{
      throw new RuntimeException();
    }
    finally {
      System.err.println("finally");
    }*/

    /*try {
      System.exit(42);
    } finally {
      System.err.println("finally");
    }*/


      /*try {
        System.err.println("try");
        if (true) {throw new RuntimeException();}
      } finally {
        System.err.println("finally");
      }
      System.err.println("more");*/


    /*try {
      System.err.println("try");
      if (true) {return;}
    } finally {
      System.err.println("finally");
    }
    System.err.println("more");*/

    /*System.err.println(f());
  }
  public static int f() {
    try {
      throw new RuntimeException();
    } finally {
      return 1;
    }*/

    /*try {
      System.err.print(" 0");
      // nothing
      System.err.print(" 1");
    } catch(Error e) {
      System.err.print(" 2");
    } finally {
      System.err.print(" 3");
    }
    System.err.print(" 4");*/

    /*try {
      System.err.print(" 0");
      try {
        System.err.print(" 1");
        System.err.print(" 2");
      } catch (RuntimeException e) {
        System.err.print(" 3");
      } finally {
        System.err.print(" 4");
      }
      System.err.print(" 5");
    } catch (Exception e) {
      System.err.print(" 6");
    } finally {
      System.err.print(" 7");
    }
    System.err.print(" 8");*/

    /*try {
      System.err.print(" 0");
      try {
        System.err.print(" 1");
        if (true) {
          throw new RuntimeException();
        }
        System.err.print(" 2");
      } catch (RuntimeException e) {
        System.err.print(" 3");
      } finally {
        System.err.print(" 4");
      }
      System.err.print(" 5");
    } catch (Exception e) {
      System.err.print(" 6");
    } finally {
      System.err.print(" 7");
    }
    System.err.print(" 8");*/

    try {
      System.err.print(" 0");
      try {
        System.err.print(" 1");
        if (true) {
          throw new Error();
        }
        System.err.print(" 2");
      } catch (RuntimeException e) {
        System.err.print(" 3");
      } finally {
        System.err.print(" 4");
      }
      System.err.print(" 5");
    } catch (Exception e) {
      System.err.print(" 6");
    } finally {
      System.err.print(" 7");
    }
    System.err.print(" 8");
  }
}
