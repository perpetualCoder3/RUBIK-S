# RUBIK-S
This is the code that generates algorithm to solve rubik's cube........

HOW TO USE THE CODE.......................................

1-Initially you have to store the code in the fule named input.txt  (enter the path of the file in your input method in the code).

2-You have to store the code in this form eg: 

                                            1-B L F' L' F2 R2 U' D2 R' L2 L' B' D D2 B R' B' F B R' U' F2 D2 R' B2
                                            
  Seperated by spaces.
  
3-To generated the scramble you can also use the other file "scramble" to generate the number of scramble as you need by changing the value in for loop.The scramble will be stored in the input file.

4-Now run the "Solver" file which will give you the set of algorithm to solve the rubik's cube.eg:

      
      1-B L F' L' F2 R2 U' D2 R' L2 L' B' D D2 B R' B' F B R' U' F2 D2 R' B2 
      cross track 1     B U R' U U R' U U U L'
      cross track     U L L U' R R U' F F U B B
      f2l       F' U F F' U U F
      f2l       F U U F' L U' U' L'
      f2l       F U F' MD L U' L' MD' B U' B'
      f2l       L' U L MD MD R' U U R MD' MD' L' U L
      oll       U R U R' U' R' F R F'
      pll        U U U R U R' U' R' F R R U' R' U' R U R' F'
      last move       U U
            SOLVED
      1
      
      
5-THE END.....................................................................


MEANING OF THE ALGORITHM GIVEN BY THE CODE.....................

F=front clockwise

F'=front anticlockwise

U=up clockwise

U'=up anticlockwise

B=back clockwise

B'=back anticlockwise

D=down clockwise

D'=down anticlockwise

L=left clockwise

L'=left anticlockwise

R=right clockwise

R'=right anticlockwise

M=middle virticle clockwise

M'=middle virticle anticlockwise

MD=middle horizontal and down piece clockwise

MD'=middle horizontal and down piece anticlockwise

r=middle virticle and right piece clockwise

r'=middle virticle and right piece anticlockwise

l=middle virticle and left piece clockwise

l'=middle virticle and left piece anticlockwise

u=middle horizontal and up piece clockwise

u'=middle horizontal and up piece anticlockwise

x=rotate the cube clockwise along x axis

x'=rotate the cube anticlockwise along x axis

y=rotate the cube clockwise along y axis

y'=rotate the cube anticlockwise along y axis


