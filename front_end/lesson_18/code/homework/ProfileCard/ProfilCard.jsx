import React from "react";
import "./styles.css";

function ProfileCard({ profileInfo }) {
  return (
    <div className="profile-card">
      <img
        id="avatar"
        src={profileInfo.avatar}
        alt={`${profileInfo.firstName} ${profileInfo.lastName}`}
      />
      <h2>
        {profileInfo.firstName} {profileInfo.lastName}
      </h2>
      <p>Род деятельности:</p>
      <ul>
        <li>{profileInfo.occupation}</li>
      </ul>
      <p>Характеристики:</p>
      <ul>
        <li>{profileInfo.hairColor}</li>
        <li>{profileInfo.height}</li>
      </ul>
      <p>Хобби:</p>
      <ul>
        <li>{profileInfo.hobby}</li>
      </ul>
      {/* 1 из способов показывать или не показывать данные на странице через тернарный оператор */}
      {/* {profileInfo.homePets ? <p>Home pets:</p> : null} */}
      {/* 2 cпособ: синтаксис &&. Левая часть - это ture или false, 
      а правая - это то что мы отображаем, если у нас левая часть = true */}
      {profileInfo.homePets && <p>Home pets:</p>}
      <ul>
        {profileInfo?.homePets?.dog ? (
          <li>Dog: {profileInfo?.homePets.dog}</li>
        ) : null}
        {profileInfo?.homePets?.cat ? (
          <li>Cat: {profileInfo?.homePets.cat}</li>
        ) : null}
      </ul>
    </div>
  );
}

export default ProfileCard;
