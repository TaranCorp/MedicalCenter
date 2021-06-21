import React from "react";
import classes from "./Header.module.css"
import {NavLink} from "react-router-dom";

const Header = () => {
    return (
        <div className={classes.header}>
            <ul>
                <li><NavLink exact to={"/"} activeClassName={classes.active}>Home</NavLink></li>
                <li><NavLink exact to={"/doctors"} activeClassName={classes.active}>Doctors</NavLink></li>
                <li><NavLink exact to={"/patients"} activeClassName={classes.active}>Patients</NavLink></li>
            </ul>
        </div>
    )
};

export default Header;