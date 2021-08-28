#declare yellow = color rgb<0.965, 0.741, 0.376>;
#declare white = color rgb<1, 1, 1>;              
#declare pink = color rgb<0.961, 0.792, 0.765>;
                                                
camera { location<6, 2, -6> look_at<0, 0, 0> }

light_source { <-10, 15, -10> white }
light_source { <10, 20, -15> white }    

box { <0, 0, 0> <1, 1, 1> pigment { white } }

box { <-1,  -0.2, -5> <2,  0, 25> pigment { pink } }
box { <-1, -0.9, -5> <2, -0.7, 25> pigment { pink } }     

cylinder { <1, 0, -5> <1, 0, -10> 2 pigment { yellow } }       

plane { <0, 1, 0>, -5 pigment { checker color yellow, color pink scale 0.5 } }         

plane { <1, 0, 0>, -10 pigment { checker color yellow, color pink scale 0.5 } }  

plane { <0, 0, 1>, 20 pigment { checker color yellow, color pink scale 0.5 } }