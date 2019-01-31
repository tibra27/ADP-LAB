class Bank:
	def __init__(self,bal):
		self.amount=0
		self.balance=bal
	def deposit(self):
		self.amount=float(input("enter the amount to be deposited::"))
		self.balance+=self.amount
		print("your a/c is deposited successfully!!!")
	def withdraw(self):
		self.amount=float(input("enter the amount to be withdraw::"))
		if self.balance>=self.amount:
			self.balance-=self.amount
			print("withdrawal successful!!!")
		else:
			print("insufficient balance in your a/c!!!")
	def show_balance(self):
		print("your current balance is:",self.balance)
a1=Bank(5000)
a1.show_balance()
a1.deposit()
a1.withdraw()
a1.show_balance()
		
