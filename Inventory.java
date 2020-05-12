import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Names{

	pulbic static Name InventoryList(){

		list<Name> Inventory = new ArrayList<>();

		static void add(Name){

			this.Name = Name;

			if(Inventory.contains(this.Name) == -1){
				Inventory.add(this.Name);
			}
		}
		static void remove(Name){

			this.Name = Name;

			Invntory.remove(this.Name);

		}

		static getList(){
			return Inventory;
		}
	}
}