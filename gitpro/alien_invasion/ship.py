import pygame

class Ship():
    def __init__(self, screen):
        """初始化飞船并设置其初始位置"""
        self.screen = screen
        
        # 加载飞船图像并获取其外接矩形
        self.image = pygame.image.load('images/ship.bmp')# 这个函数返回一个表示飞船的surface, 而我们将这个surface存储到了self.image中
        self.rect = self.image.get_rect()# 通过这个函数获取相应surface的属性rect.要将游戏元素居中，可设置相应rect 对象的属性center 、centerx 或centery 。要让游戏元素与屏幕边缘对齐，可使用属性top 、bottom 、left 或right ；要调整游戏元素的水平或垂直位置，可使用属性x 和y ，它们分别是相应矩形左上角的 x 和 y 坐标。e.g. 在Pygame中，原点(0, 0)位于屏幕左上角，向右下方移动时，坐标值将增大。在1200×800的屏幕上，原点位于左上角，而右下角的坐标为(1200, 800)
        self.screen_rect = screen.get_rect() # 获取screen的rect以方便对齐
        
        # 将每艘飞船放在屏幕底部中央
        self.rect.centerx = self.screen_rect.centerx
        self.rect.bottom = self.screen_rect.bottom
    
    def blitme(self):
        """在指定位置绘制飞船"""
        self.screen.blit(self.image, self.rect)