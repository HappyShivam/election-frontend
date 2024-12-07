document.getElementById("loginForm").addEventListener("submit", async (e) => {
    e.preventDefault();
    const studentID = document.getElementById("studentID").value;
    const password = document.getElementById("password").value;
  
    const response = await fetch("http://localhost:3000/login", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ studentID, password }),
    });
  
    const data = await response.json();
  
    if (data.success) {
      document.getElementById("loginForm").style.display = "none";
      document.getElementById("votingSection").style.display = "block";
  
      document.querySelectorAll(".vote-button").forEach((button) => {
        button.addEventListener("click", async () => {
          const candidate = button.getAttribute("data-candidate");
          const voteResponse = await fetch("http://localhost:3000/vote", {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({ studentID, candidate }),
          });
          const voteData = await voteResponse.json();
          alert(voteData.message);
        });
      });
    } else {
      alert("Login failed!");
    }
  });
  