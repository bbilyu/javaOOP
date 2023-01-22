
from interface import Interface
class PhoneBook:
    def __init__(self,interface: Interface):
        self.contacts = []
        self.interface = interface

    def __int__(self,contact,interface: Interface):
        self.interface = interface
        self.contacts = []
        self.contacts.add(contact)

    def __index__(self,contact,interface: Interface):
        self.interface = interface
        self.contacts = contact

    def add_contact(self,contact):
        self.contacts.append(contact)

    def remove_contact(self,contact):
        self.contacts.remove(contact)

    def change_contact(self,contact,parametr_number: int):
        match parametr_number:
            case 1:
                contact.set_name(self.interface.input_name())
            case 2:
                contact.set_surname(self.interface.input_surname())
            case 3:
                contact.set_phone_number(self.interface.input_phone_number())

    def search_contact(self,contact):
        index = -1
        for c in self.contacts:
            if c.get_name() == contact.get_name() and c.get_surname() == contact.get_surname() and int(c.get_phone_number()) == int(contact.get_phone_number()):
                index = self.contacts.index(c)
                break
        return index

    def get_contact(self,index:int):
        return self.contacts[index-1]

    def get_all_contacts(self):
        return self.contacts

    def delete_all_contacts(self):
        self.contacts = []
