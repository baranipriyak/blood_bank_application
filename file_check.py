import os

# List of folders to skip
SKIP_FOLDERS = ['node_modules', '.git', '__pycache__', '.vscode', '.angular', '.editconfig', '.gitignore', '.metadata', '.mvn', '.settings', 'target', 'file_check.py']

# Function to recursively read the directory and its contents
def read_directory(dir_path, indent=''):
    try:
        # Get the list of all files and directories in the current directory
        items = os.listdir(dir_path)
        
        # Iterate through each item in the directory
        for index, item in enumerate(items):
            full_path = os.path.join(dir_path, item)
            
            if os.path.isdir(full_path):
                # Skip the folder if it's in the skip list
                if item in SKIP_FOLDERS:
                    continue
                
                # Print directory name
                print(f"{indent}└── {item}/")
                # Recursively call the function for subdirectories
                read_directory(full_path, indent + '    ')
            else:
                # Print file name
                if index == len(items) - 1:
                    print(f"{indent}└── {item}")
                else:
                    print(f"{indent}├── {item}")

    except PermissionError:
        print(f"Permission denied: {dir_path}")
    except Exception as e:
        print(f"Error: {e}")

# Example usage: Provide the directory you want to scan
folder_path = '.'  # Change this to the folder you want to scan
read_directory(folder_path)
