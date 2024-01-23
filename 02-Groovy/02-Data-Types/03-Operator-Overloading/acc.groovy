// Class Defination ("MyAccount")
// - This class "MyAccount" represent a simple account with a balance which has single property 'balance' of type BigDecimal to store the account balance 

// Custom Plus Methord( "Plus" )
// - class defines a custom methord 'plus' to handle addition of two "MyAcount" objects
// - methord taks another "MyAccount" object as "other" as a perameter and returns a new "MyAccunt" Object with the sum of the balance 
// - inside the "plus" method, a new "MyAccount" object is created, and its balance is set to be the sum of the balances of the current instance ("this.balance") and the provided "other" instance ("other.balance").



class MyAccount {
     BigDecimal balance 

     // Our own plus logic
     MyAccount plus(MyAccount other) {
        new MyAccount(balance: this.balance + other.balance)
     }
    
     //Converting Balance out into string readble format 
     String toString() { 
        "Account Balance = $balance"
     }
}
MyAccount savings = new MyAccount(balance: 100.00)
MyAccount current = new MyAccount(balance : 50.00)

println savings
println current
println savings + current 




