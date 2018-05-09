/**
 *
 * Copyright (c) 2006-2018, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.company.sakila.generated;

import com.company.sakila.SakilaApplication;
import com.company.sakila.SakilaApplicationBuilder;
import com.company.sakila.SakilaApplicationImpl;
import com.company.sakila.db0.sakila.actor.ActorManagerImpl;
import com.company.sakila.db0.sakila.actor.ActorSqlAdapter;
import com.company.sakila.db0.sakila.address.AddressManagerImpl;
import com.company.sakila.db0.sakila.address.AddressSqlAdapter;
import com.company.sakila.db0.sakila.category.CategoryManagerImpl;
import com.company.sakila.db0.sakila.category.CategorySqlAdapter;
import com.company.sakila.db0.sakila.city.CityManagerImpl;
import com.company.sakila.db0.sakila.city.CitySqlAdapter;
import com.company.sakila.db0.sakila.country.CountryManagerImpl;
import com.company.sakila.db0.sakila.country.CountrySqlAdapter;
import com.company.sakila.db0.sakila.customer.CustomerManagerImpl;
import com.company.sakila.db0.sakila.customer.CustomerSqlAdapter;
import com.company.sakila.db0.sakila.film.FilmManagerImpl;
import com.company.sakila.db0.sakila.film.FilmSqlAdapter;
import com.company.sakila.db0.sakila.film_actor.FilmActorManagerImpl;
import com.company.sakila.db0.sakila.film_actor.FilmActorSqlAdapter;
import com.company.sakila.db0.sakila.film_category.FilmCategoryManagerImpl;
import com.company.sakila.db0.sakila.film_category.FilmCategorySqlAdapter;
import com.company.sakila.db0.sakila.film_text.FilmTextManagerImpl;
import com.company.sakila.db0.sakila.film_text.FilmTextSqlAdapter;
import com.company.sakila.db0.sakila.inventory.InventoryManagerImpl;
import com.company.sakila.db0.sakila.inventory.InventorySqlAdapter;
import com.company.sakila.db0.sakila.language.LanguageManagerImpl;
import com.company.sakila.db0.sakila.language.LanguageSqlAdapter;
import com.company.sakila.db0.sakila.payment.PaymentManagerImpl;
import com.company.sakila.db0.sakila.payment.PaymentSqlAdapter;
import com.company.sakila.db0.sakila.rental.RentalManagerImpl;
import com.company.sakila.db0.sakila.rental.RentalSqlAdapter;
import com.company.sakila.db0.sakila.staff.StaffManagerImpl;
import com.company.sakila.db0.sakila.staff.StaffSqlAdapter;
import com.company.sakila.db0.sakila.store.StoreManagerImpl;
import com.company.sakila.db0.sakila.store.StoreSqlAdapter;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.Injector;
import com.speedment.runtime.application.AbstractApplicationBuilder;

/**
 * A generated base {@link
 * com.speedment.runtime.application.AbstractApplicationBuilder} class for the
 * {@link com.speedment.runtime.config.Project} named sakila.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedSakilaApplicationBuilder extends AbstractApplicationBuilder<SakilaApplication, SakilaApplicationBuilder> {
    
    protected GeneratedSakilaApplicationBuilder() {
        super(SakilaApplicationImpl.class, GeneratedSakilaMetadata.class);
        withManager(ActorManagerImpl.class);
        withManager(AddressManagerImpl.class);
        withManager(CategoryManagerImpl.class);
        withManager(CityManagerImpl.class);
        withManager(CountryManagerImpl.class);
        withManager(CustomerManagerImpl.class);
        withManager(FilmManagerImpl.class);
        withManager(FilmActorManagerImpl.class);
        withManager(FilmCategoryManagerImpl.class);
        withManager(FilmTextManagerImpl.class);
        withManager(InventoryManagerImpl.class);
        withManager(LanguageManagerImpl.class);
        withManager(PaymentManagerImpl.class);
        withManager(RentalManagerImpl.class);
        withManager(StaffManagerImpl.class);
        withManager(StoreManagerImpl.class);
        withComponent(ActorSqlAdapter.class);
        withComponent(AddressSqlAdapter.class);
        withComponent(CategorySqlAdapter.class);
        withComponent(CitySqlAdapter.class);
        withComponent(CountrySqlAdapter.class);
        withComponent(CustomerSqlAdapter.class);
        withComponent(FilmSqlAdapter.class);
        withComponent(FilmActorSqlAdapter.class);
        withComponent(FilmCategorySqlAdapter.class);
        withComponent(FilmTextSqlAdapter.class);
        withComponent(InventorySqlAdapter.class);
        withComponent(LanguageSqlAdapter.class);
        withComponent(PaymentSqlAdapter.class);
        withComponent(RentalSqlAdapter.class);
        withComponent(StaffSqlAdapter.class);
        withComponent(StoreSqlAdapter.class);
    }
    
    @Override
    public SakilaApplication build(Injector injector) {
        return injector.getOrThrow(SakilaApplication.class);
    }
}