package com.hotelplan.cluedo;

import java.util.ArrayList;
import java.util.List;

/**
 * Crime
 * @author Peter Rutschmann
 * @version 18.09.2022
 */
public class Crime{
   private int actor = 0;
   private int weapon = 0;
   private int scene = 0;

   private List<String> history = new ArrayList<>();

   public int getActor() {
      return actor;
   }

   public int getWeapon() {
      return weapon;
   }

   public int getScene() {
      return scene;
   }

   public List<String> getHistory() {
      return history;
   }

   public void setActor(int actor) {
      this.actor = actor;
   }

   public void setWeapon(int weapon) {
      this.weapon = weapon;
   }

   public void setScene(int scene) {
      this.scene = scene;
   }

   public void setHistory(List<String> history) {
      this.history = history;
   }

   @Override
   public String toString() {
      return "Crime{" +
              "actor=" + actor +
              ", weapon=" + weapon +
              ", scene=" + scene +
              ", history=" + history +
              '}';
   }
}
