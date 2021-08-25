#declare Color = color<1, 1, 0>  ;
#declare PosX = 0;
#declare PosY = 1;
#declare PosZ = 2;
#declare Radius = 2;                
 
camera {
    location<0, 2, -3>
    look_at<0, 1, 2>
}                  

light_source {
    <2, 4, -3>
    color<1, 1, 0>
}                 

sphere {
    <PosX, PosY, PosZ>, Radius
    texture {
        pigment {
            Color
        }
    }
}