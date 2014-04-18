package com.entities.pokemon;

/**
 * Handles the Pokemon and their attributes
 * @author Miles Black
 * April 17, 2014
 */

public class Pokemon {
	
	/**
	 * Fields
	 */
	private String name;
	private int id;
	private int level;
	private int hitpoints;
	private int attack;
	private int defense;
	private int speed;
	private int specialAttack;
	private int specialDefense;
	private Type type;
	private Move[] moves;
	
	/**
	 * Default Pokemon constructor
	 * @param name The name of the Pokemon
	 * @param id The ID number of the Pokemon
	 * @param level The level of the Pokemon
	 * @param hitpoints The hitpoints of the Pokemon
	 * @param attack The attack of the Pokemon
	 * @param defense The defense of the Pokemon
	 * @param speed The speed of the Pokemon
	 * @param specialAttack The special attack of the Pokemon
	 * @param specialDefense The special defence of the Pokemon
	 * @param type The type of the Pokemon
	 * @param moves The four moves the Pokemon has
	 */
	public Pokemon(String name, int id, int level, int hitpoints, int attack, int defense, int speed, int specialAttack, int specialDefense, Type type, Move[] moves) {
		this.name = name;
		this.id = id;
		this.level = level;
		this.hitpoints = hitpoints;
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
		this.specialAttack = specialAttack;
		this.specialDefense = specialDefense;
		this.type = type;
		this.moves = moves;
	}
	
	/**
	 * Returns the name of the Pokemon
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the id of the Pokemon
	 * @return id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Returns the level of the Pokemon
	 * @return level
	 */
	public int getLevel() {
		return level;
	}
	
	/**
	 * Returns the hitpoints of the Pokemon
	 * @return hitpoints
	 */
	public int getHitPoints() {
		return hitpoints;
	}
	
	/**
	 * Returns the attack of the Pokemon
	 * @return attack
	 */
	public int getAttack() {
		return attack;
	}
	
	/**
	 * Returns the defense of the Pokemon
	 * @return defense
	 */
	public int getDefense() {
		return defense;
	}
	
	/**
	 * Returns the speed of the Pokemon
	 * @return speed
	 */
	public int getSpeed() {
		return speed;
	}
	
	/**
	 * Returns the special attack of the Pokemon
	 * @return specialAttack
	 */
	public int getSpecialAttack() {
		return specialAttack;
	}
	
	/**
	 * Returns the special defense of the Pokemon
	 * @return specialDefense
	 */
	public int getSpecialDefense() {
		return specialDefense;
	}
	
	/**
	 * Returns the type of the Pokemon
	 * @return type
	 */
	public Type getType() {
		return type;
	}
	
	/**
	 * Returns the id of the Pokemon
	 * @return id
	 */
	public Move[] getMoves() {
		return moves;
	}
	
	/**
	 * Sets the name of the Pokemon
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Sets the id of the Pokemon
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Sets the level of the Pokemon
	 * @param level
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	
	/**
	 * Sets the hitpoints of the Pokemon
	 * @param hitpoints
	 */
	public void setHitPoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}
	
	/**
	 * Sets the attack of the Pokemon
	 * @param attack
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	/**
	 * Sets the defense of the Pokemon
	 * @param defense
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	/**
	 * Sets the speed of the Pokemon
	 * @param speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	/**
	 * Sets the special attack of the Pokemon
	 * @param special attack
	 */
	public void setSpecialAttack(int specialAttack) {
		this.specialAttack = specialAttack;
	}
	
	/**
	 * Sets the special defense of the Pokemon
	 * @param special defense
	 */
	public void setSpecialDefense(int specialDefense) {
		this.specialDefense = specialDefense;
	}
	
	/**
	 * Sets the type of the Pokemon
	 * @param type
	 */
	public void setType(Type type) {
		this.type = type;
	}
	
	/**
	 * Sets the moves of the Pokemon
	 * @param moves
	 */
	public void setMoves(Move[] moves) {
		this.moves = moves;
	}
	
	/**
	 * Sets a particular move of a Pokemon
	 * @param i The index of the move (0-3)
	 * @param move The move that is being set
	 */
	public void setMove(int i, Move move) {
		this.moves[i] = move;
	}

}
