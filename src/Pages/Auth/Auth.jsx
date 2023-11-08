import React from "react";
import { useLocation } from "react-router-dom";
import Signin from "../../Components/Register/Signin";
import Signup from "../../Components/Register/Singup";
import "./Auth.css" 

const Auth = () => {
  const location=useLocation();
  return (
    <div>
     
        <div class="flex items-center justify-center h-[100vh]">
          <div className="relative mr-10 hidden lg:block">
            <div className="h-[20rem] w-[20rem]">
              <img
              className="h-full w-full"
              src="https://dcassetcdn.com/design_img/2055988/595659/595659_10883114_2055988_fe019eca_image.jpg"
              alt="Picpop Homepage"
            />
            <di className="">
            </di>

            </div>
            
          </div>

          <div className="form md:w-[35vw] lg:w-[22vw]">

            {location.pathname === "/" ? <Signin/> :  <Signup/>}
           
          </div>
        </div>
      </div>
    
  );
};

export default Auth;

// https://res.cloudinary.com/dnbw04gbs/image/upload/v1679490221/screenshot4_hb7xtr.png
//
// 
// 