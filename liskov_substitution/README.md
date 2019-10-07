# Liskov Substitution Principle

**Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it.**

The key to understanding the Liskov Substitution Principle is thinking about _processes that use_ (sub)classes, rather than the (sub)classes themselves. In the bad example here, the io.shodo.formations.solid.ls.UnitUpgrader purports to accept any Apartment (an abstract class) and upgrade it. However, once the io.shodo.formations.solid.ls.UnitUpgrader starts upgrading the apartment (`upgrade(Apartment)`), it checks the specific class/subtype of the Apartment object to make sure it doesn't add a bedroom to a io.shodo.formations.solid.ls.Studio (which by definition has zero bedrooms). A io.shodo.formations.solid.ls.Studio object therefore cannot be substituted in for any Apartment.

If you don't follow the LSP, external processes will either break, behave improperly, or need to know too much information.
