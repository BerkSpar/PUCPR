camera { location<-2, 3, -7> look_at<0, 2, 0> }

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

#for (i, 0, 100, 4)
    object {Lollipop translate<i, 0, i>}
#end