cp -> copy file

cp -r folder newFolder -> copy folder content to newFolder 

mv -> move or rename file and folder

rm -> used to delete a file

rm -r -> del a folder


find path -name "*abc"


grep -> Global regular expression print

absolute path -> Always starts from root directory. larger
relative path -> relative to your current directory. shorter

/Users/lovepreet/Downloads/June_batch/src/jul07/readMe.md

 
  permissions       memory block.    owner           group owner.  file size.   date time.     file/folder
d rwxr-xr-x.          2              ec2-user         ec2-user      6           Jul  3 01:56       a


- rw-r--r--.          1 ec2-user ec2-user  12 Jul  3 01:51 readMe2.txt

owner
group 
other


rwx               r-x                    r-x.

r -> read
w -> write
x -> execute


0 -> no permission
1 -> execute
2 -> write
4 -> read
5 -> read+exceute
6 -> read + write
7 -> read write execute

chmod 400

owner.   group.      other
rwx.      r-x         r-x
7.        5           5

755

create 3 files public.txt private.txt exec.sh

public file 644
private 400 ---- try to edit this file 
exec 755

