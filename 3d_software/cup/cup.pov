camera { location<8, 8, -15> look_at<0, 0, 1> }            

light_source { <10, 100, -40> color rgb<1, 1, 1> }
                                                       
plane { <0, 1, 0>, 0 pigment{ color rgb<1, 1, 1> } } 

object {
    union {
        object {
            difference {
                torus { 2, 0.3 }
                box { <-3, -1, -3>, <0, 1, 3> }
            }
            rotate -90*x translate 2*x translate 2.5*y
        }     
        difference {
            cylinder { <0, 0, 0>, <0, 5, 0>, 2 }
            cylinder { <0, 1, 0>, <0, 5.1, 0>, 1.8 }
        }
        torus { 1.9, 0.1 translate 5*y }
    }                                                         
    texture {
        pigment { color rgb<1, 1, 0>} 
        finish { ambient 0.2 specular 0.5 }
    }
}
               
