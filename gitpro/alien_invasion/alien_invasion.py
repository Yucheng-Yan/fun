import sys
import pygame
from settings import Settings
from ship import Ship

def run_game():
    # 初始化游戏并创建一个屏幕对象
    pygame.init() # 初始化背景设置
    ai_settings = Settings() # 创建包含游戏设置的Settings实例
    screen = pygame.display.set_mode((ai_settings.screen_height, ai_settings.screen_height)) # 创建一个名为screen, 尺寸为1200x800的窗口, 长和宽通过实例访问settings.py中的数据
	# 游戏中的每一个元素(e.g. 游戏窗口、外星人和飞船)都是一个surface，l7的函数返回的surface(screen)表示整个游戏窗口
    pygame.display.set_caption("Alien Invasion")
    
    # 创建一艘飞船
    ship = Ship(screen)# 必须在主while循环前面创建该实例, 以免每次循环时都创建一艘飞船
    
    # 设置背景色
    bg_color = (230, 230, 230)
    
    # 开始游戏的主循环
    while True:
        # 监视键盘和鼠标事件
        for event in pygame.event.get(): # 我们使用pygame.event.get()来访问pygame检测到的事件，所有键盘和鼠标事件都促使for循环运行
            if event.type == pygame.QUIT:
                sys.exit()
        
        # 每次循环时都重绘屏幕
        screen.fill(ai_settings.bg_color) # 用背景色填充屏幕：这个方法只接受一个实参 ——— 一种颜色, 这里通过Settings的实例访问settings.py中的数据
        ship.blitme()# 我们调用这个函数将飞船绘制到屏幕上, 确保它出现在背景前面
                	
        # 让最近绘制的屏幕可见
        pygame.display.flip() # 在这里，它在每次执行while 循环时都绘制一个空屏幕，并擦去旧屏幕，使得只有新屏幕可见。在我们移动游戏元素时，pygame.display.flip() 将不断更新屏幕，以显示元素的新位置，并在原来的位置隐藏元素，从而营造平滑移动的效果
        
run_game() # 初始化游戏并开始游戏的主循环