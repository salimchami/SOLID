# Open/Closed Principle

**Software entitites should be open for extension, but closed for modification**

Notice how in the bad example, any time we want to add a new style of greeting, we have to change the io.shodo.formations.solid.oc.Greeter class to accept a new type of personality. We don't want to have to modify our existing, working code to add something new. Instead, as demonstrated in the good example, we have a high-level io.shodo.formations.solid.oc.Greeter class that is instantiated with some Personality... we don't know which yet, just that it will be some object that implements the Personality interface. Now we can add new objects like FormalPersonality, CasualPersonality, and IntimatePersonality, and just make sure they correctly implement the Personality interface (in this case that means they must have a `greet()` method). The io.shodo.formations.solid.oc.Greeter class is now open for future extension, while remaining closed for modification.
