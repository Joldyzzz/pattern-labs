package Creational.FactoryMethod.FactoryMethodJava.src;

import Creational.FactoryMethod.FactoryMethodJava.src.windows.Window;

// Может быть чисто абстрактным (интерфейсом)
// или содержать реализацию
// Фабричные методы могут параметризированы с целью создания
// разных видов продуктов
public class Supplier {
	public Window createWindow() {
		return new Window() {
			@Override
			public String toString() {
				return "Окно";
			}
			@Override
			public void open() {
				System.out.println("Открыли окно");
			}
		};
	}

	// hook
	protected void onInstall(Window window)
	{
		Program.windows.add(window);
	}

	public Window install()
	{
		Window window = createWindow();
		System.out.printf("Установлено %s\n", window);
		onInstall(window); // hook
		return window;
	}
}
