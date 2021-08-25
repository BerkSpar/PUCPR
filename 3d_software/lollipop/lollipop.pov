camera { location<-4, 3, -10> look_at<0, 2, 0> }

light_source { <2, 10, -3> color rgb<1, 1, 1> }
light_source { <-2, 3, -3> color rgb<1, 1, 1> }                     

#declare Lollipop =
union {   
    cylinder {
        <0, 0, 0>,
        <0, 4, 0>,
        0.35
        pigment {
            color rgb<1, 1, 0>
        }
    }
    sphere {
        <0, 4, 0>, 1
        pigment {
            color rgb<1, 0, 0>
        }
    }
}         

Lollipop