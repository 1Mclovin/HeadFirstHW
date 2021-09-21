public class Notes {
    public static void main(String[] args) {
    }
}
/*
Notes for Head first Java book chapters 2-5
using OO we can really be flexible with it and use this to our advantage.
methods work for all sorts of shapes in this instance. you can apply the same method to multiple things at once.
So basically with inheritance you can give all other subclasses of the parent class the same methods as the parent class.
Over ridding means that the sub class can redefine the methods when it needs too from the parent.
When designing a class think about the objects that will be created from the class type.
things to think about: things the object knows, things the object does
example for some "knows" of a shopping cart, the shopping cart knows all of the cartContents
the shopping cart "does", addToCart(),Remove from cart(), CheckOut()
an object that knows things about itself are called instance variables, this can be things like the title, the artist,
but things that an object can do are called methods. these methods can do things like set the title, set the artist, and play, honestly anything you want.
tv instance variables: black, powersOn, needElectricity
tv methods: changeChannel(), turnOn(), turnOff(), startRecording()
objects have instance variables and methods but they are designed as part of the class.
a class is not an object, but a class is used to contruct objects.
a class is the blueprint of an object, each object made from the same class can have its own values for the instance variables
like for example, think of a notepad. each page in the note pad is already designed to take information. think of the notepad as a class.
and on every sheet of notepad paper you are creating a new object under the same class.
lets make an object.
make the object in a dog class
At runtime a java program is nothing more than objects talking to other objects
an object knows things and does things
a class basically describes how to make the object, a class is like the blueprint
things that the object does are called methods. and things that object knows about itself are called instance variables.

CHAPTER 3
Variables come in two flavors, primitive and reference.
Object reference variables come from an object
variables must have a type wether it be int,string, boolean or whatever the case.
variable type and then the set name you give it

CHAPTER 4
A method uses parameters, a caller passes the arguments.
if a method takes a parameter you must pass it something
if you declare a method to return a value you must also return the same value as the declared type
methods can have more than one parameter you must seperate them with commas
getters and setters, the purpose of a getter is literally to send back as a return value.
the purpose of a setter is to set the value of an instance variable
these are very important when we want to hide data and make sure that they arent being misused and that our data isint being changed
this is Standard rule: mark the instance variables private and provide public the getters and setters for access control.
^ that is called encapsulation
Mark instance variables private and mark getters and setters public...
if you dont assign a value to instance variables and or you dont call a variable then you will automatically get 0
INSTANCE VARIABLES ARE WITHIN A CLASS AND NOT A METHOD.
LOCAL VARIABLES ARE DECLARED WITHIN A METHOD
LOCAL VARIABLES MUST BE INITIALIZED BEFORE USE or else they will not run.
Stopped at page 85. need brain rest and sleep.
in order to compare variables use ==
but in order to check if objects are equal you would use this method: .equals()
the == operator compares two variables of any kind and returns true or false
for best practice always keep variables private and use methods to call them

CHAPTER 5 - EXTRA STRENGTH METHODS
Steps for the battleship game or for any game at that.
figure out what the class is supposed to do
list the instance variables and methods
write prepcode for the method (this is basically pseudo coding)
write testcode for the methods
implement the class
test the methods
debug and reimplement as needed


 */