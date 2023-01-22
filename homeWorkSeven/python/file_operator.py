
from contact import Contact

class FileOperator():

    def __init__(self,interface):
        self.interface = interface

    def input_contacts_horisontal_format(self,file_name:str,phone_book):
        with open(f"{file_name}","r") as file:
            line = file.readline()
            while len(line):
                new_contact = line.split(" ")
                phone_book.get_all_contacts().append(Contact(new_contact[0],new_contact[1],int(new_contact[2])))
                line = file.readline()

    def input_contacts_vertical_format(self,file_name:str,phone_book):
        with open(f"{file_name}","r") as file:
            line = file.readline()
            new_contact = []
            while len(line):
                if len(new_contact) < 4:
                    new_contact.add(line)
                else:
                    phone_book.get_all_contacts().append(Contact(new_contact[0], new_contact[1], int(new_contact[2])))
                    new_contact = []
                line = file.readline()

    def extract_contacts_horisontal_format(self,file_name:str,phone_book):
       if self.check_file(file_name):
           try:
               with open(f"{file_name}","w") as file:
                   for contact in  phone_book.get_all_contacts():
                       file.write(f"{contact.get_name()} {contact.get_surname()} {contact.get_phone_number()}\n")
               self.interface.contact_successfully_extract()
           except:
               print("Ошибка записи!")
       else:
           print("Ошибка записи!")

    def extract_contacts_vertical_format(self,file_name:str,phone_book):
       if self.check_file(file_name):
           try:
               with open(f"{file_name}","w") as file:
                   for contact in  phone_book.get_all_contacts():
                       file.write(f"{contact.get_name()}\n{contact.get_surname()}\n{contact.get_phone_number()}\n\n")
               self.interface.contact_successfully_extract()
           except:
               print("Ошибка записи!")
       else:
           print("Ошибка записи!")

    def check_file(self,file_name:str):
        try:
            file = open(f'{file_name}.txt')
        except IOError as e:
            if self.interface.file_not_found():
                my_file = open(f"{file_name}.txt", "w+")
                my_file.close()
                return True
            else:
                return False
        else:
            return True

if __name__ == '__main__':
    FileOperator().input_contacts_horisontal_format(file_name = "bin_fut")