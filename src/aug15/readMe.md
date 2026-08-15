
Class hierarchy

                   Throwable
                        |    
                        |
        Error                           Exception

Types of exception
- Checked exception  ----- Compile time ---- InterruptedException, FileNotFoundException, SQLException
- Unchecked Exception ----- RunTime --- Arithmetic,  NullPointerException, ArrayIndexOutOfBoundsException,
IllegalArgumentException, ClassCastException

Handle the exceptions
- try
- catch
- finally
- throw
- throws

try {
// risky code
} catch (Exception ){
// handle the exception
}

Flow
- JVM detects the exception
- Create the object of that exception
- Look for matching exception block
- Execute the catch block
- Program normal flow will be executed

WAP to handle Nullpointer and ArrayIndexoutofbound exception.


try block will always gets executed no matter what and
it is used to do the cleanup kind of stuff like closing the open connections like DB, files.

try with resources 

try with catch
try with finally
try with catch & finally
try alone


throw --- when u want to explicitly throw an exception.
throws --- method may throw an exception and it is used with method signature.




