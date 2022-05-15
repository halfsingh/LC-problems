# Demonstrate thye use of Keyword-only arguments


# use keyword-only arguments to help ensure code clarity

def myfunction(arg1, arg2, *, supressExceptions=False):
    pass


def main():
    myfunction(1, 2, supressExceptions=True)


if __name__ == "__main__":
    main()
