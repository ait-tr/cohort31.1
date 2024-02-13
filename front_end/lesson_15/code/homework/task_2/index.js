async function findSmthToDo() {
    const link = "https://www.boredapi.com/api/activity";
    const response = await fetch(link);
    const task = await response.json();
  
    const activity = document.createElement("div");
    activity.textContent = "Activity: " + task.activity;
    document.body.append(activity);
  
    const type = document.createElement("div");
    type.textContent = "Type: " + task.type;
    document.body.append(type);
  
    const participants = document.createElement("div");
    participants.textContent = "Participants: " + task.participants;
    document.body.append(participants);
  
    const price = document.createElement("div");
    price.textContent = "Price: " + task.price;
    document.body.append(price);
  
    const linkTask = document.createElement("div");
    linkTask.textContent = "Link: " + task.link;
    document.body.append(linkTask);
  }
  findSmthToDo();