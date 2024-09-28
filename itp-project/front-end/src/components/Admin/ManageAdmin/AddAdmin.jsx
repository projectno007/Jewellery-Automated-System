import React, { Component } from "react";
import FacebookLogin from "react-facebook-login";
import { Link } from "react-router-dom";
import "./../../../App.css";

import { storageRef } from "../../../firebase";
import M from "materialize-css";

class AddAdmin extends Component {
  constructor(props) {
    super(props);
    this.state = {
      image: undefined,
      profileimg: "",
    };
  }
  
  componentDidMount(){
  	let elems = document.querySelectorAll('select');
    	M.FormSelect.init(elems, {});
  }

  componentClicked = () => {
    console.log();
  };

  style = () => {
    return {
      backgroundColor: "#f5f5f5",
      borderRadius: "5px",
      marginTop: "-5px",
      marginBottom: "-10px",
    };
  };

  getStyle = () => {
    return {
      width: "20%",
    };
  };

  imageUpdalod = (e) => {
    if (e.target.files[0]) {
      this.setState({ image: e.target.files[0] });
    } else {
      alert("please choose a profile picture");
    }
  };

  render() {
    return (
      <div className="contsainer test" style={this.style()}>
        <div className="col s12 m7">
          <div className="card horizontal">
            <div className="card-image hide-on-small-only">
              <img
                id="signUpImage"
                alt=""
                src="https://image.freepik.com/free-vector/add-notes-concept-illustration_114360-3376.jpg"
                height="100%"
              />
            </div>
            <div className="card-stacked">
              <div className="card-content">
                <h4 className="center-align grey-text">Add New Admin</h4>
                <div className="row">
                  <form className="col s12">
                    <div className="row">
                      <div className="input-field col s6">
                        <input
                          id="first_name"
                          type="text"
                          className="validate"
                        />
                        <label htmlFor="first_name" id="firstNameLabel">
                          First Name
                        </label>
                      </div>
                      <div className="input-field col s6">
                        <input
                          id="last_name"
                          type="text"
                          className="validate"
                        />
                        <label htmlFor="last_name" id="lastNameLabel">
                          Last Name
                        </label>
                      </div>
                    </div>
                     <div className="row">
                      <div className="input-field col s12">
                        <input id="Nic" type="email" className="validate" />
                        <label htmlFor="Nic" id="emailNameLabel">
                          NIC 
                        </label>
                      </div>
                    </div>
                    <div className="row">
                      <div className="input-field col s12">
                        <input id="email" type="email" className="validate" />
                        <label htmlFor="email" id="emailNameLabel">
                          User Name
                        </label>
                      </div>
                    </div>
                    <div class="input-field col s12">
    			<select>
      				<option value="" disabled selected>Choose admin role</option>
      				<option value="ROOT_DRIVER">Driver</option>
      				<option value="ROOT_JMANAGER">Jewellery Manager</option>
      				<option value="ROOT_RMANAGER">Renatal Manager</option>
      				<option value="ROOT_SMANAGER">Service Manager</option>
      				<option value="ROOT_SUPMANAGER">Renatal Manager</option>
      				<option value="ROOT_OMANAGER">Order Manager</option>
    			</select>
    			<label>Materialize Select</label>
  		    </div>

                    <div className="row">
                      <div className="input-field col s6">
                        <input
                          id="password"
                          type="password"
                          className="validate"
                        />
                        <label htmlFor="password" id="passwordLabel">
                          Password
                        </label>
                      </div>
                      <div className="input-field col s6">
                        <input
                          id="cpassword"
                          type="password"
                          className="validate"
                        />
                        <label htmlFor="cpassword" id="cpasswordLabel">
                          Confirm Password
                        </label>
                      </div>
                    </div>
                    <div className="progress hide test">
                      <div className="indeterminate"></div>
                    </div>
                    

                    <div className="center-align center">
                      <button
                        className="btn center-align grey darken-3"
                        style={{ width: "100%" }}
                        onClick={this.signUp}
                      >
                        Add Admin
                      </button>
                    </div>
                    <br />
                    
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }

  signUp = async (e) => {
    await e.preventDefault();
    let isvalid = true;
    let emptyColumns = [];

    let name = AddAdmin.mytrim(document.getElementById("email").value);
    let firstName = AddAdmin.mytrim(document.getElementById("first_name").value);
    let lastName = AddAdmin.mytrim(document.getElementById("last_name").value);
    let telephone = AddAdmin.mytrim(document.getElementById("mobile").value);
    let password = AddAdmin.mytrim(document.getElementById("password").value);
    let cpassword = AddAdmin.mytrim(document.getElementById("cpassword").value);

    name.length === 0
      ? emptyColumns.push(document.getElementById("emailNameLabel"))
      : console.log("email is not empty");
    firstName.length === 0
      ? emptyColumns.push(document.getElementById("firstNameLabel"))
      : console.log("fname is not empty");
    lastName.length === 0
      ? emptyColumns.push(document.getElementById("lastNameLabel"))
      : console.log("lname is not empty");
    telephone.length === 0
      ? emptyColumns.push(document.getElementById("telephoneLable"))
      : console.log("mobile is not empty");
    password.length === 0
      ? emptyColumns.push(document.getElementById("passwordLabel"))
      : console.log("mobile is not empty");
    cpassword.length === 0
      ? emptyColumns.push(document.getElementById("cpasswordLabel"))
      : console.log("mobile is not empty");

    emptyColumns.length === 0 ? (isvalid = true) : (isvalid = false);

    if (isvalid) {
      //show the wait indicators
      let waitIndicator = document.querySelectorAll(".progress");
      waitIndicator.forEach((item) => {
        item.classList.remove("hide");
        item.classList.add("show");
      });
      
       try {
        let self = this;
        const files = document.getElementById("photoupload").files;
        const file = files[0];
        // Create the file metadata
        const metadata = {
          contentType: "image/jpeg"
        };

        const fileRef = storageRef
          .child(`${this.name}/` + file.name);

        const uploadTaskSnapshot = await fileRef.put(file, metadata);

        const downloadURL = await uploadTaskSnapshot.ref.getDownloadURL();
	this.setState({image: downloadURL});
        console.log(downloadURL);

      } catch (error) {
        console.log("ERR ===", error);
        alert("Image uploading failed!");
      }
      
      //controller call
      const reg = await fetch("/api/v2/customer/register", {
        headers: {
          Accept: "application/json",
          "Content-Type": "application/json",
        },
        method: "POST",
        body: JSON.stringify({
          name: name,
          firstName: firstName,
          lastName: lastName,
          telephone: telephone,
          pword: password,
          profilePicture: this.state.image,
        }),
      });

      const call = await fetch(`/api/v2/customer/find/${name}`);
      const result = await call.json();
      sessionStorage.setItem("userId", result.customer_id);
      sessionStorage.setItem("email", result.name);
      sessionStorage.setItem("FirstName", result.firstName);
      sessionStorage.setItem("LastName", result.lastName);
      sessionStorage.setItem("telephone", result.telephone);
      sessionStorage.setItem("address", result.address);
      sessionStorage.setItem("profileImg", this.state.image);
      
      M.toast({ html: "Successfully registered" });
      this.props.history.push("/");

      
    } else {
      emptyColumns.forEach((emptyColumn) => {
        emptyColumn.classList.add("red-text");
      });

      setTimeout(() => {
        emptyColumns.forEach((emptyColumn) => {
          emptyColumn.classList.remove("red-text");
        });
      }, 2000);
    }
  };

  static mytrim = (inputString) => {
    return inputString.replace(/\s/g, "");
  };
}

export default AddAdmin;
