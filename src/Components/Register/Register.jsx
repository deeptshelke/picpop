import { Form } from "formik";
import React from "react";
import "./Register.css";

const Register = () => {
  return (
    <div>
      <div class="flex">
      <div>
            <img
            className="h-[80vh]"
          src="https://i.imgur.com/P1l0iYz.jpg"
          alt="Picpop Homepage"
        />
        </div>
        
        <div class="">
          <img
            src=""
            alt="Picpop Logo"
          />

          <form>
            <input type="text" placeholder="Username" />
            <input type="password" placeholder="Password" />
            <button type="submit">Log In</button>
          </form>
        </div>
      </div>
    </div>
  );
};

export default Register;
