class Data:
    def __init__ (self):
        self.admno=0
        self.Name=""
        self.markseng=0
        self.marksmaths=0
        self.markssci=0
        self.readData()
        self.total=0
    def readData(self):
        self.admno=int(input())
        self.Name=input()
        self.markseng=int(input())
        self.marksmaths=int(input())
        self.markssci=int(input())
    def compute(self):
        self.total=self.markssci+self.marksmaths+self.markseng
    def showData(self):
        print(self.admno,self.Name,self.markseng,self.marksmaths,self.markssci,self.total)
d1=Data()
d1.compute()
d1.showData()
