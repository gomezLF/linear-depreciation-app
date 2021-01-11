package model;

import java.time.LocalDate;

public abstract class Asset {
	
	/**
	 * The name of the asset
	 */
	private String name;
	
	/**
	 * The cost of the asset
	 */
	private double cost;
	
	/**
	 * Category to which the asset belongs
	 */
	private String category;
	
	/**
	 * Value that indicates the accumulated depreciation of the asset up to the current date
	 */
	private double accumulatedDepreciation;
	
	/**
	 * The date the asset was recorded
	 */
	private LocalDate registrationDate;
	
	/**
	 * Date indicating when the asset was retired
	 */
	private LocalDate retirementDate;
	
	/**
	 * Optional description about the asset
	 */
	private String descriptionRegister;
	
	/**
	 * Description indicating the reason why the asset was retired
	 */
	private String descriptionRetirement;
	
	/**
	 * Boolean which indicates if the asset is not deprecated
	 */
	private boolean isNonDepreciableAsset;
	
	/**
	 * Boolean which indicates if the asset was retired
	 */
	private boolean retired;
	
	
	
	/**
	 * Create a new asset with its name, cost, category, registration date, an optional description of the asset,
	 * and a Boolean indicating whether it is an asset that is not deprecated.
	 * 
	 * @param name The name of the asset
	 * @param cost The cost of the asset
	 * @param category Category to which the asset belongs
	 * @param registrationDate The date the asset was recorded
	 * @param descriptionRegister Optional description about the asset
	 * @param isNonDepreciableAsset Boolean which indicates if the asset is not deprecated
	 */
	public Asset(String name, double cost, String category, LocalDate registrationDate, String descriptionRegister, boolean isNonDepreciableAsset) {
		this.name = name;
		this.cost = cost;
		this.category = category;
		this.registrationDate = registrationDate;
		this.descriptionRegister = descriptionRegister;
		this.isNonDepreciableAsset = isNonDepreciableAsset;
		
		accumulatedDepreciation = 0.0;
		retirementDate = null;
		descriptionRetirement = "";
		retired = false;
	}



	/**
	 * Returns the name of the asset
	 * 
	 * @return The name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String nombre) {
		this.name = nombre;
	}


	/**
	 * Returns the cost of the asset
	 * 
	 * @return The cost
	 */
	public double getCost() {
		return cost;
	}


	/**
	 * @param cost the cost to set
	 */
	public void setCost(double costo) {
		this.cost = costo;
	}


	/**
	 * Returns the category to which the asset belongs
	 * 
	 * @return The category
	 */
	public String getCategory() {
		return category;
	}


	/**
	 * @param category the category to set
	 */
	public void setCategory(String categoria) {
		this.category = categoria;
	}

	
	/**
	 * Returns a value that indicates the accumulated depreciation of the asset up to the current date
	 * 
	 * @return the accumulatedDepreciation
	 */
	public double getAccumulatedDepreciation() {
		return accumulatedDepreciation;
	}


	/**
	 * @param accumulatedDepreciation the accumulatedDepreciation to set
	 */
	public void setAccumulatedDepreciation(double accumulatedDepreciation) {
		this.accumulatedDepreciation = accumulatedDepreciation;
	}
	
	
	/**
	 * Returns the date the asset was recorded
	 * 
	 * @return the registrationDate
	 */
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}


	/**
	 * @param registrationDate the registrationDate to set
	 */
	public void setRegistrationDate(LocalDate fechaRegistro) {
		this.registrationDate = fechaRegistro;
	}


	/**
	 * Returns the date indicating when the asset was retired
	 * 
	 * @return the retirementDate
	 */
	public LocalDate getRetirementDate() {
		return retirementDate;
	}


	/**
	 * @param retirementDate the retirementDate to set
	 */
	public void setRetirementDate(LocalDate fechaRetiro) {
		this.retirementDate = fechaRetiro;
	}


	/**
	 * Returns an optional description about the asset
	 * 
	 * @return the descriptionRegister
	 */
	public String getDescriptionRegister() {
		return descriptionRegister;
	}


	/**
	 * @param descriptionRegister the descriptionRegister to set
	 */
	public void setDescriptionRegister(String descripcionRegistro) {
		this.descriptionRegister = descripcionRegistro;
	}


	/**
	 * Returns a description indicating the reason why the asset was retired
	 * 
	 * @return the descriptionRetirement
	 */
	public String getDescriptionRetirement() {
		return descriptionRetirement;
	}


	/**
	 * @param descriptionRetirement the descriptionRetirement to set
	 */
	public void setDescriptionRetirement(String descripcionRetirado) {
		this.descriptionRetirement = descripcionRetirado;
	}
	
	/**
	 * Returns a boolean which indicates if the asset is not deprecated
	 * 
	 * @return the isNonDepreciableAsset - true if the asset is not deprecated. False otherwise
	 */
	public boolean isNonDepreciableAsset() {
		return isNonDepreciableAsset;
	}

	
	/**
	 * @param isNonDepreciableAsset the isNonDepreciableAsset to set
	 */
	public void setNonDepreciableAsset(boolean isNonDepreciableAsset) {
		this.isNonDepreciableAsset = isNonDepreciableAsset;
	}
	
	
	/**
	 * Returns a boolean which indicates if the asset was retired
	 * 
	 * @return the retired - true if the asset was retired. False otherwise
	 */
	public boolean isRetired() {
		return retired;
	}


	/**
	 * @param retired the retired to set
	 */
	public void setRetired(boolean retirado) {
		this.retired = retirado;
	}

	
	
	
	
	
}
