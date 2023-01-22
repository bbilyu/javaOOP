import sys
from controller import Controller
from file_operator import FileOperator
from interface import Interface
from phone_book import PhoneBook

class Program():
    def __init__(self):
        self.interface = Interface()
        self.phone_book = PhoneBook(interface=self.interface)
        self.file_operator = FileOperator(interface=self.interface)
        self.controller = Controller(interface=self.interface,phone_book=self.phone_book,file_operator=self.file_operator)
        
    def start(self):
        self.controller.start()

    def stop(self):
        sys.exit(1)