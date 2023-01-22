import sys
from contact import Contact

class Controller():
    def __init__(self,interface,phone_book,file_operator):
        self.interface = interface
        self.phone_book = phone_book
        self.file_operator = file_operator

    def start(self):
        self.interface.clear_console()
        match self.interface.main_menu():
            case 1:
                self.interface.clear_console()
                self.phone_book.add_contact(Contact(self.interface.input_name(),self.interface.input_surname(),self.interface.input_phone_number()))
                self.interface.press_enter()
                self.start()
            case 2:
                self.interface.clear_console()
                self.phone_book.remove_contact(self.phone_book.get_contact(self.interface.index_contact_in_list(self.phone_book)))
                self.interface.contact_successfully_deleted()
                self.interface.press_enter()
                self.interface.clear_console()
                self.start()
            case 3:
                self.interface.clear_console()
                self.phone_book.change_contact(self.phone_book.get_contact(self.interface.index_contact_in_list(self.phone_book)),self.interface.choose_change_contact())
                self.interface.press_enter()
                self.interface.clear_console()
                self.start()
            case 4:
                self.con = Contact(self.interface.input_name(),self.interface.input_surname(),self.interface.input_phone_number())
                self.index = self.phone_book.search_contact(self.con)
                self.interface.clear_console()
                if (self.index != -1):
                    self.interface.print_contact_in_list(index = self.index,contact=self.con)
                else:
                    self.interface.contact_not_found()
                self.interface.press_enter()
                self.interface.clear_console()
                self.start()
            case 5:
                self.interface.clear_console()
                self.interface.print_all_contacts(self.phone_book.get_all_contacts())
                self.interface.press_enter()
                self.interface.clear_console()
                self.start()
            case 6:
                match self.interface.choose_format():
                    case 1:
                        self.interface.clear_console()
                        self.file_operator.input_contacts_horisontal_format(file_name=self.interface.file_name(),phone_book=self.phone_book)
                        self.interface.contact_successfully_input()
                        self.interface.press_enter()
                        self.interface.clear_console()
                        self.start()
                    case 2:
                        self.interface.clear_console()
                        self.file_operator.input_contacts_vertical_format(file_name=self.interface.file_name(),phone_book=self.phone_book)
                        self.interface.contact_successfully_input()
                        self.interface.press_enter()
                        self.interface.clear_console()
                        self.start()
            case 7:
                match self.interface.choose_format():
                    case 1:
                        self.interface.clear_console()
                        self.file_operator.extract_contacts_horisontal_format(file_name=self.interface.file_name(), phone_book=self.phone_book)
                        self.interface.press_enter()
                        self.interface.clear_console()
                        self.start()
                    case 2:
                        self.interface.clear_console()
                        self.file_operator.extract_contacts_vertical_format(file_name=self.interface.file_name(), phone_book=self.phone_book)
                        self.interface.press_enter()
                        self.interface.clear_console()
                        self.start()
            case 8:
                self.interface.clear_console()
                self.phone_book.delete_all_contacts()
                self.interface.press_enter()
                self.interface.clear_console()
                self.start()
            case 9:
                sys.exit(1)
            case _:
                sys.exit(1)